package ru.job4j.ex;

public class ElementNotFoundException extends Exception {

    public ElementNotFoundException(String msg) {
    }

    public static class FindEl {
            public static int indexOf(String[] value, String key) throws ElementNotFoundException {
                int rsl = -1;
                for (int i = 0; i < value.length; i++) {
                    if (key.equalsIgnoreCase(value[i])) {
                        rsl = Integer.parseInt(value[i]);
                    } else {
                        throw new ElementNotFoundException("Element not found");
                    }
                }
                return rsl;
            }
        }

    public static void main(String[] args) {
        try {
            FindEl.indexOf(new String[]{"one", "two", "three"}, "four");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
    }

