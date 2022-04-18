import math

def encryption(sString):
    sString = ''.join(sString.split(' '))
    iCol = math.ceil(math.sqrt(len(sString)))
    return ' '.join([sString[i:: iCol] for i in range(iCol)])

if __name__ == "__main__":
    lTestedString = [
        "haveaniceday",
        "chillout",
        "aaa"
    ]
    for sString in lTestedString:
        print(encryption(sString))
