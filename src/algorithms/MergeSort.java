package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vishal on 27/5/15.
 */
public class MergeSort {

    private static int passCount = 0;
    public static void main(String[] args){
        List<Integer> unsortedList = Arrays.asList(13,5,4,1,8,7,2,6,3);
        List<Integer> sortedList = mergeSort(unsortedList);
        System.out.println(Arrays.toString(sortedList.toArray()));
    }

    private static List<Integer> mergeSort(List<Integer> unsortedList) {
        if(unsortedList.size() <=1){
            return unsortedList;
        }
        int indexToBreak = unsortedList.size()/2;
        return sortTwoLists(mergeSort(unsortedList.subList(0, indexToBreak)),
                mergeSort(unsortedList.subList(indexToBreak, unsortedList.size())));
    }

    private static List<Integer> sortTwoLists(List<Integer> list1, List<Integer> list2) {
        System.out.println("Sorting lists " + printListElements(list1) + " and" + printListElements(list2));
        List<Integer> sortedPartialList = new ArrayList<Integer>();
        int indexOfList1 = 0;
        int indexOfList2 = 0;
        for(int k=0; k< list1.size()+list2.size();k++){
            if(indexOfList1 >= list1.size()){
                copyRemainingElementsOfTheList(sortedPartialList, list2, indexOfList2);
                break;
            } else if(indexOfList2 >= list2.size()){
                copyRemainingElementsOfTheList(sortedPartialList, list1, indexOfList1);
                break;
            } else if (list1.get(indexOfList1)<list2.get(indexOfList2)){
                sortedPartialList.add(list1.get(indexOfList1));
                ++indexOfList1;
            } else{
                sortedPartialList.add(list2.get(indexOfList2));
                ++indexOfList2;
            }
        }
        System.out.println("Sorted list "+ printListElements(sortedPartialList));
        return sortedPartialList;
    }

    private static void copyRemainingElementsOfTheList(List<Integer> destination, List<Integer> source, int indexToStart){
        while(indexToStart<source.size()){
            destination.add(source.get(indexToStart));
            ++indexToStart;
        }
    }

    private static String printListElements(List<Integer> listToPrint){
        String listElements = "[";
        for(Integer element: listToPrint){
            listElements+=element+",";
        }
        listElements=listElements.substring(0,listElements.length()-1);
        listElements+="]";
        return listElements;
    }
}
