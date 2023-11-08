def quickSort(arr):
    if not arr: return []
    smaller, larger = [], []
    pivot = arr[len(arr) - 1]
    for n in arr:
        if n > pivot: larger.append(n)
        elif n < pivot: smaller.append(n)
    print(smaller, larger)
    return quickSort(smaller) + [pivot] + quickSort(larger)