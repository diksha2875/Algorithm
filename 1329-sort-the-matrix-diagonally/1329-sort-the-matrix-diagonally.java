class Solution {
    public int[][] diagonalSort(int[][] mat) {
    int r = mat.length;
    int c = mat[0].length;
    for(int i = r - 1; i >= 0; i--){
        List<Integer> list = new ArrayList<>();
        int x = i;
        int y = 0;
        while(x < r && y < c){
            list.add(mat[x++][y++]);
        }
        Collections.sort(list);
        x = i;
        y = 0;
        int index = 0;
        while(x < r && y < c){
            mat[x++][y++] = list.get(index++);
        }
    }

    for(int i = 1; i < c; i++){
        List<Integer> list = new ArrayList<>();
        int x = 0;
        int y = i;
        while(x < r && y < c){
            list.add(mat[x++][y++]);
        }
        Collections.sort(list);
        x = 0;
        y = i;
        int index = 0;
        while(x < r && y < c){
            mat[x++][y++] = list.get(index++);
        }
    }
    return mat;
    }
}
  
        
        