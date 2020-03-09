package yarchuk;

import java.util.Arrays;

public class StringCollection {
    private String[] strings;

    public StringCollection() {
        this.strings = new String[0];
    }

    public void add(String string) {
        if (this.strings.length == 0) {
            arrayIncrease();
            this.strings[strings.length - 1] = string;
        } else {
            if (this.strings[this.strings.length - 1] != null) {
                arrayIncrease();
                this.strings[strings.length - 1] = string;
            } else
                for (int i = 0; i < this.strings.length; i++) {
                    if (this.strings[i] == null) {
                        this.strings[i] = string;
                        break;
                    }
                }
        }
    }

    public String[] remove(String string) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(string)) {
                if (strings.length - 1 - i >= 0)
                    System.arraycopy(this.strings, i + 1, this.strings, i,
                            this.strings.length - 1 - i);
                arrayDecrease();
                break;
            }
        }
        return strings;
    }

    public String getByIndex(int index) {
        return strings[index];
    }

    public boolean contains(String string) {
        for (String s : strings) {
            if (s.equals(string)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringCollection that = (StringCollection) o;
        return Arrays.equals(strings, that.strings);
    }

    public void clear() {
        this.strings = Arrays.copyOf(this.strings, 0);
    }

    public Integer indexOf(String string) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(string)) {
                return i;
            }
        }
        return null;
    }

    public int getSize() {
        return strings.length;
    }

    //увеличеваем массив на 1 элемент
    private void arrayIncrease() {
        try {
            this.strings = Arrays.copyOf(this.strings, this.strings.length + 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Упс. Что-то пошло не так!");
        }
    }

    //уменьшаем массив на 1 элемент
    private void arrayDecrease() {
        try {
            this.strings = Arrays.copyOf(this.strings, this.strings.length - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Упс. Что-то пошло не так!");
        }
    }
}