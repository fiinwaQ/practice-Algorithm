class TimeConversion {
  public static void main(String[] args) {
    String[] lTestedTime = {
      "07:05:45PM",
      "12:00:00AM",
      "12:01:00AM",
      "12:00:00PM",
      "12:01:00PM",
      "13:59:59PM",
      "10:59:59PM",
      "12:40:22AM"
    };
    for (String sTestedTime: lTestedTime) {
      System.out.println(timeConversion(sTestedTime));
    }
  }

  static String timeConversion(String sTime) {
    String sActualTime = sTime.substring(0, sTime.length() - 2);
    String sFormat = sTime.substring(sTime.length() - 2);
    String[] lTimeFraction = sActualTime.split(":", 2);
    int iHour = Integer.parseInt(lTimeFraction[0]);
    iHour %= 12;
    if ("PM".equals(sFormat.toUpperCase())) {
      iHour += 12;
    }
    return (String.format("%02d", iHour) + ":" + lTimeFraction[1]);
  }
}
