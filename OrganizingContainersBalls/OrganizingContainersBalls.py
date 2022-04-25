def organizingContainersFirst(lContainers):
    lSum = [sum(lContainer) for lContainer in lContainers]
    for lSameBall in zip(*lContainers):
        iSumSameBall = sum(lSameBall)
        if iSumSameBall not in lSum:
            return "Impossible"
        lSum.remove(iSumSameBall)
    else:
        return "Possible"


def organizingContainersSecond(lContainers):
    lSumRow = [sum(lContainer) for lContainer in lContainers]
    lSumCol = [sum(lSameBall) for lSameBall in zip(*lContainers)]
    return "Impossible" if sorted(lSumRow) != sorted(lSumCol) else "Possible"


if __name__ == "__main__":
    lTestedContainers = [
        [[1, 1], [1, 1]],
        [[0, 2], [1, 1]],
        [[1, 3, 1], [2, 1, 2], [3, 3, 3]],
        [[0, 2, 1], [1, 1, 1], [2, 0, 0]]
    ]
    for lContainers in lTestedContainers:
        print(organizingContainersSecond(lContainers))
