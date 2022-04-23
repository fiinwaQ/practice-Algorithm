import java.util.Arrays;

class BiggerIsGreater {
  public static void main(String[] args) {
    String[] lTestedString = {
      "ab",
      "bb",
      "hefg",
      "dhck",
      "dkhc",
      "lmno",
      "dcba",
      "dcbb",
      "abdc",
      "abcd",
      "fedcbabcd",
      "aaaaaaaaabbbbbb",
      "ehdegnmorgafrjxvksc"
    };
    for (String sTestedString: lTestedString) {
      System.out.println(biggerIsGreater(sTestedString));
    }
  }

  static String biggerIsGreater(String sString) {
    char[] lString = sString.toCharArray();
    char cTemp;
    for (int x = (lString.length - 2); x > -1; --x) {
      if (lString[x] < lString[x + 1]) {
        for (int y = (lString.length - 1); y > x; --y) {
          if (lString[y] > lString[x]) {
            cTemp = lString[y];
            lString[y] = lString[x];
            lString[x] = cTemp;
            char[] lSubString = Arrays.copyOfRange(lString, x + 1, lString.length);
            Arrays.sort(lSubString);
            return String.valueOf(Arrays.copyOfRange(lString, 0, x + 1)) + String.valueOf(lSubString);
          }
        }
      }
    }
    return "no answer";
  }
}
