class Encryption {
  public static void main(String[] args) {
    String[] lTestedString = {
      "haveaniceday",
      "chillout",
      "aaa"
    };
    for (String sTestedString: lTestedString) {
      System.out.println(encryption(sTestedString));
    }
  }

  static String encryption(String sString) {
    String sSubString = String.join("", sString.split(" "));
    int iCol = (int) Math.ceil(Math.sqrt(sString.length()));
    String sResult = "";
    for (int x = 0; x < iCol; ++x) {
      for (int y = x; y < sSubString.length(); y += iCol)
        sResult += sSubString.charAt(y);
      sResult += " ";
    }
    return sResult;
  }
}
