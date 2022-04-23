def biggerIsGreater(sString):
    lString = list(sString)
    for x in range(len(sString) - 2, -1, -1):
        if sString[x] < sString[x + 1]:
            for y in range(len(sString) - 1, x, -1):
                if sString[y] > sString[x]:
                    lString[x], lString[y] = lString[y], lString[x]
                    return ''.join(lString[: x + 1] + sorted(lString[x + 1:]))
    else:
        return "no answer"


if __name__ == "__main__":
    lTestedString = [
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
    ]
    for sString in lTestedString:
        print(biggerIsGreater(sString))
