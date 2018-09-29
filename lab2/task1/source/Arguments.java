import java.util.Arrays;

public class Arguments {
    private String[] strings;

    public Arguments(String[] strings) {
        this.strings = strings;
    }

    /**
     * The sort method
     *  @param strings - input array of strings
     *  @return sorted array
     */
    public String sort(String[] strings) {
        Arrays.sort(strings, (x,y) -> Integer.compare(x.length(),y.length()));
        return Arrays.deepToString(strings);
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            result += String.format("String[%d]: %s, Length: %d\n", i, strings[i], strings[i].length());
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arguments that = (Arguments) o;
        return Arrays.equals(strings, that.strings);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(strings);
    }
}
