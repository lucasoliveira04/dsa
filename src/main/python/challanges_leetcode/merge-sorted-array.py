def merge_sorted_arrays(list1, m, list2, n):
    while (m > 0 and n > 0):
        if list1[m - 1] > list2[n - 1]:
            list1[m + n - 1] = list1[m - 1]
            m -= 1
        else:
            list1[m + n - 1] = list2[n - 1]
            n -= 1
    while n > 0:
        list1[n - 1] = list2[n - 1]
        n -= 1

def main():
    list1 = [1,2,3,0,0,0]
    list2 = [2,5,6]

    m = 3
    n = 3

    merge_sorted_arrays(list1, m, list2, n)
    print(list1)

if __name__ == "__main__":
    main()
