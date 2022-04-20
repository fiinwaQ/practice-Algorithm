import java.util.Arrays;

class OrganizingContainersBalls {
  public static void main(String[] args) {
    int[][][] lTestedContainers = {
      {{1, 1}, {1, 1}},
      {{0, 2}, {1, 1}},
      {{1, 3, 1}, {2, 1, 2}, {3, 3, 3}},
      {{0, 2, 1}, {1, 1, 1}, {2, 0, 0}}
    };
    for (int iContainerId = 0; iContainerId < lTestedContainers.length; ++iContainerId) {
      System.out.println(organizingContainers(lTestedContainers[iContainerId]));
    }
  }

  static String organizingContainers(int[][] lContainers) {
    int iSumRow = 0, iSumCol = 0;
    int[] lSumRow = new int[lContainers.length], lSumCol = new int[lContainers.length];
    for (int iRow = 0; iRow < lContainers.length; ++iRow) {
      iSumRow = 0;
      for (int iCol = 0; iCol < lContainers[iRow].length; ++iCol) {
        iSumRow += lContainers[iRow][iCol];
      }
      lSumRow[iRow] = iSumRow;
    }
    for (int iCol = 0; iCol < lContainers[0].length; ++iCol) {
      iSumCol = 0;
      for (int iRow = 0; iRow < lContainers.length; ++iRow) {
        iSumCol += lContainers[iRow][iCol];
      }
      lSumCol[iCol] = (iSumCol);
    }
    Arrays.sort(lSumRow);
    Arrays.sort(lSumCol);
    return Arrays.equals(lSumRow, lSumCol) ? "Possible" : "Impossible";
  }
}
