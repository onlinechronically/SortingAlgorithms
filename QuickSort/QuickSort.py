def quickSort(arr):
    if not arr: return []
    smaller, larger = [], []
    pivot = arr[len(arr) - 1]
    for n in arr[:-1]:
        if n >= pivot: larger.append(n)
        elif n < pivot: smaller.append(n)
    return quickSort(smaller) + [pivot] + quickSort(larger)