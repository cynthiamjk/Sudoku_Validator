import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class Solution {

     public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {

        Set<T> items = new HashSet<>();
        return list.stream()
                .filter(n -> !items.add(n)) 
                .collect(Collectors.toSet());

    }

    public static List <Integer> fortyfive(int startRow, int startCol, int arr[][]) {
        List<Integer> list = new ArrayList<>();
      
        int lengthRow = startRow + 3;
        int lengthCol = startCol + 3;


        for (int i = startCol; i < lengthCol; i++) {
            for (int j = startRow; j < lengthRow; j++) {
                list.add(arr[i][j]);

            }
        }
        
return  list;

    }

    public static void wrongSub(Set<Integer> list, List<Boolean> bools) {
        if(!list.isEmpty()) {
           bools.add(false);
        }
    }

   


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        

        int [][] grid = new int [9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int n = in.nextInt();
                grid[i][j] = n;
            }
        }

        int[] resultRow = new int[grid.length];
        int[] resultCol = new int[grid.length];
        int totalRow;
        int totalCol;

    for (int i=0; i < grid.length; i++) {
        totalRow = 0;
        totalCol = 0;
        
        for (int j=0; j < grid[i].length; j++) {
         
          totalRow += grid[i][j];
            totalCol += grid[j][i];
                
        }
         resultRow[i] = totalRow;
         resultCol[i] = totalCol;
       
    }

   
    List <Integer> fortyfiveRow = new ArrayList<>();
    List <Integer> fortyfiveCol = new ArrayList<>();

    for(int i = 0; i < resultCol.length; i++) {
        if (resultCol[i] != 45) {
            fortyfiveCol.add(resultCol[i]);
        }
    }


    for(int i = 0; i < resultRow.length; i++) {
        if (resultRow[i] != 45) {
            fortyfiveRow.add(resultRow[i]);
        }
    }




    List <Boolean> bools = new ArrayList<>();
    wrongSub(findDuplicateBySetAdd(fortyfive(0, 0, grid)), bools);
    wrongSub(findDuplicateBySetAdd(fortyfive(3, 0, grid)), bools);
    wrongSub(findDuplicateBySetAdd(fortyfive(6, 0, grid)), bools);
    wrongSub(findDuplicateBySetAdd(fortyfive(0, 3, grid)), bools);
    wrongSub(findDuplicateBySetAdd(fortyfive(0, 6, grid)), bools);
    wrongSub(findDuplicateBySetAdd(fortyfive(3, 3, grid)), bools);
    wrongSub(findDuplicateBySetAdd(fortyfive(6, 3, grid)), bools);
    wrongSub(findDuplicateBySetAdd(fortyfive(3, 6, grid)), bools);
    wrongSub(findDuplicateBySetAdd(fortyfive(6, 6, grid)), bools);

    
      


    if ( bools.isEmpty() && fortyfiveCol.isEmpty() && fortyfiveRow.isEmpty()) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }

   
    
      
    }

 
    
    
    }