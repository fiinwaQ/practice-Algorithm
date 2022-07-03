def kangaroo(x1, v1, x2, v2):
    if (v1 == v2):
        return "YES" if (x1 == x2) else "NO"
    timeToMeet = ((x2 - x1) / (v1 - v2))
    # return "YES" if (timeToMeet > 0 and timeToMeet == int(timeToMeet)) else "NO"
    return "YES" if (timeToMeet > 0 and timeToMeet % 1 == 0) else "NO"

if __name__ == "__main__": 
    lKangaroos = [
        (0, 3, 4, 2),
        (0, 2, 5, 3),
        (21, 6, 47, 3)
    ]
    for lKangaroos in lKangaroos:
        print(kangaroo(*lKangaroos))