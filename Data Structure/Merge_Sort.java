/*
> Does the line
>
> ```java
> for (i = 0; i < temp.length; i++) {
>     arr[left + i] = temp[i];
> }
> ```
>
> copy the `temp` array **only once at the end** (after all recursion),
> or **for each recursive call**?

---

### ✅ Answer:

It executes **for every recursive call**, not just once at the end.

---

### 🔍 Why?

Let’s recall what happens during Merge Sort recursion:

Each recursive call to

```java
mergeSort(arr, left, right)
```

is responsible for **sorting and merging only its own subarray** — from index `left` to `right`.

When that call finishes, it ensures that portion (`arr[left...right]`) is sorted.

So:

* Each recursive call creates its **own `temp` array**, which merges **its own left and right halves**.
* Then it copies back from that `temp` into the **main array (`arr`)** at the appropriate position (`left + i`).

This happens many times — one copy-back per merge operation — until the recursion has merged everything up to the full array.

---

### 🧠 Visualization example

Suppose the array = `{8, 3, 9, 1}`

#### Step 1:

* Recursive call `mergeSort(arr, 0, 3)`

  * Left call: `mergeSort(arr, 0, 1)`

    * Left: `mergeSort(arr, 0, 0)` → returns (1 element)
    * Right: `mergeSort(arr, 1, 1)` → returns (1 element)
    * **Merge happens here (0–1)**
      → copies sorted `{3, 8}` into `arr[0..1]`.
  * Right call: `mergeSort(arr, 2, 3)`

    * Left: `mergeSort(arr, 2, 2)` → returns
    * Right: `mergeSort(arr, 3, 3)` → returns
    * **Merge happens here (2–3)**
      → copies sorted `{1, 9}` into `arr[2..3]`.

Now both halves are sorted:
`arr = [3, 8, 1, 9]`

#### Step 2:

Back in top-level merge (0–3):

* It merges `[3, 8]` and `[1, 9]` into `{1, 3, 8, 9}`
* **Copies temp → arr** for indices `0..3`.

---

### ✅ So summary

* The `for (i = 0; i < temp.length; i++)` copy happens **every time** a merge occurs.
* Each recursive level has its own local `temp` array (independent of others).
* By the time the recursion completes, the array has been updated step by step after each merge — not just once at the end.

---

*/

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr , int left , int right) {
        if(left >= right)
            return;
        
        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        int temp[] = new int[right - left + 1];

        int i = left , j = mid +1 , k = 0;
        while(i <= mid && j <= right)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i ++;
                k ++;
            }
        else{
            temp[k] = arr[j];
            j ++;
            k ++;
            }
        }
        while(i <= mid)
        {
            temp[k] = arr[i];
            i ++;
            k ++;
        }
        while( j <= right)
        {
            temp[j] = arr[j];
            j ++;
            k++;
        }

        for(i = 0; i< temp.length ; i++)
        {
            arr[left + i] = temp[i];
        }
}

    public static void main(String[] args) {
        int[] arr = {9,1,8,3};
        int left = 0;
        int right = arr.length - 1;
        mergeSort(arr, left , right);
        System.out.println("After merge sort : " + Arrays.toString(arr));
    }
}
