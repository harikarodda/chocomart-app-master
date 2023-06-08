package com.shopping.chocomart.Misc.hashmap;

import java.util.HashMap;

public class MutableKeyDemo {
    //DEMO that illustrates how mutable keys can cause issues with a HashMap:
    public static void main(String[] args) {
        HashMap<MutableKey, String> map = new HashMap<>();

        MutableKey key1 = new MutableKey("foo");
        MutableKey key2 = new MutableKey("foo");

        map.put(key1, "value1");
        map.put(key2, "value2");

        System.out.println(map.get(key1));  // "value2" instead of "value1"

        key1.setValue("bar");

        System.out.println(map.get(key1));  // null, key1 is no longer found

    }

    static class MutableKey {
        private String value;

        public MutableKey(String value) {
            this.value = value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public int hashCode() {
            return 42;  // always returns the same hash code
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof MutableKey) {
                MutableKey other = (MutableKey) obj;
                return this.value.equals(other.value);
            }
            return false;
        }
    }
}
