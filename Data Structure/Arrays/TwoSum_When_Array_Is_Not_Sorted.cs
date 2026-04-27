
//Two sum in C# when Array is not sorted
namespace DSA
{
    internal class TwoSumWhenArrayIsNotSorted
    {
        static void Main()
        {
            int[] arr = { 10,3,8,5,2};
            int target = 15;

            Console.WriteLine("Fun call");
            int[] ans = fun(arr , target);
            Console.WriteLine(string.Join(", " , ans));
        }

        static int[] fun(int[] arr, int target)
        {
            int current, needed;

            Dictionary<int , int> map = new Dictionary<int, int> ();

            for (int i = 0; i < arr.Length; i++) { 
                current = arr [i];
                needed = target - current;

                if (map.ContainsKey(needed)) {
                    return new int[] { map[needed], i};
                }

                map.Add(current, i);
            }

            return new int[] { -1 , -1}; 
        }
    }
}
