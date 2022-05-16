package Programcollection.interviewquestions;

import java.util.*;

public class arrayprograms
{
    public void findmissingelement()
    {
        int a1[]={1,4,5,2,6,7};

        int len=a1.length;

        int sum1=0;
        for (int i=0;i<len;i++)
        {
            sum1=sum1+a1[i];
        }
        System.out.println("Sum of arrays:"+sum1);
        int sum2=0;
        for (int i=1;i<=7;i++)
        {
            sum2=sum2+i;//
        }
        System.out.println("Sum of values:"+sum2);

        int missingValue = sum2-sum1;
        System.out.println("Missing value in array="+missingValue);
    }
    public void findmissingelement1()
    {
        int ar1[] = {3,4,5,6,2,8};

        Set<Integer> ele = new HashSet<>();
        for (Integer val: ar1)
        {
            ele.add(val);
        }
        for (int i=1;i<=8;i++)
        {
            if (ele.add(i)==true)
            {
                System.out.println("Missing number:"+i);
            }
        }
    }
    public void findmaxminvalinarray()
    {

        int[] maxmin = {99,33,100,44,1011,33};

        int len = maxmin.length;
        int max = 0;
        for (int i=0;i<len;i++)
        {
            max=maxmin[i];
            for (int j=1;j<maxmin.length;j++) {
                if (max < maxmin[j]) //> for min
                {
                    max = maxmin[j];
                }
            }
        }
        System.out.println("Maximum value in array:"+max);
    }

    public void findmaxminvalinarray1()
    {
        int arr[] = {6,7,4,88,11,90,18};

        List<Integer> l = new ArrayList<Integer>(arr.length);

        for (int val:arr)
        {
            l.add(val);
        }

        System.out.println("Before sorting:"+l);
        Collections.sort(l);
        System.out.println("After sorting:"+l);

        System.out.println("Maximum value:"+l.get(l.size()-1));
        System.out.println("Minimum value:"+l.get(0));
    }

    public void findduplicate()
    {
        String[] st = {"java","C","C++","VB.Net","Python","C++","Ruby","Pearl"};
        Boolean flag = false;

        for (int i=0;i<st.length;i++)
        {
            for (int j=i+1;j<st.length;j++)
            {
                if(st[i].toLowerCase().equals(st[j].toLowerCase()))
                {
                    System.out.println("Duplicate element:"+st[i]);
                    flag=true;
                }
            }
        }
        if (flag==false)
        {
            System.out.println("No Duplicate element found");
        }
    }

    public void findduplicate1()
    {
        String[] st = {"java","C","C++","VB.Net","Python","C++","Ruby","Pearl","Python"};
        HashSet<String> hs = new HashSet<>();

        for (String val: st)
        {
            if (hs.add(val)==false)
            {
                System.out.println("Duplicate Values:"+val);
            }
        }
    }

    public void linearsearch()
    {
        int[] num = {24,55,66,7,23,77,88,99};

        int ele_search = 77;
        Boolean status = false;
        for (int i=0;i<num.length;i++)
        {
            if(ele_search==num[i])
            {
                System.out.println("Element found at index position:"+i);
                status = true;
                break;
            }
        }
        if (status==false)
        {
            System.out.println("Element not found at any position");
        }
    }

    public void searchusingbinarysearch()
    {

        Integer[] arr = {34,55,44,12,76,88};
        Arrays.sort(arr);
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,44));
//Print reverse

        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }

    public void bubblesort()
    {
        int[] arr = {45,65,78,23,99,70};

        System.out.println("Before Swapping:"+Arrays.toString(arr));

        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-1;j++)
            {
                if (arr[j]>arr[j+1])//< > for ascending and descending order
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Before Swapping:"+Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        arrayprograms obj = new arrayprograms();
//        obj.findmissingelement();
//        obj.findmissingelement1();
//        obj.findmaxminvalinarray();
//        obj.findmaxminvalinarray1();
//        obj.findduplicate();
//        obj.findduplicate1();
//        obj.linearsearch();
        obj.searchusingbinarysearch();
//        obj.bubblesort();
    }
}
