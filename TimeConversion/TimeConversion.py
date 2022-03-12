def timeConversion(sTime):
    sFormat = sTime[-2:]
    lTimeFraction = sTime[:-2].split(':', maxsplit=1)
    lTimeFraction[0] = int(lTimeFraction[0]) % 12
    if sFormat.upper() == "PM":
        lTimeFraction[0] += 12
    return str(lTimeFraction[0]).rjust(2, '0') + ':' + lTimeFraction[1]


if __name__ == "__main__":
    lTestedTime = [
        "07:05:45PM",
        "12:00:00AM",
        "12:01:00AM",
        "12:00:00PM",
        "12:01:00PM",
        "13:59:59PM",
        "10:59:59PM",
        "12:40:22AM"
    ]
    for sTestedTime in lTestedTime:
        print(timeConversion(sTime=sTestedTime))
