function quickSort(arr) {
    if (arr.length == 0)  return []
    let pivot = arr[arr.length - 1]
    let smaller = []
    let larger = []
    for (item of arr) {
        if (item > pivot) larger.push(item)
        else if (item < pivot) smaller.push(item)
    }
    return quickSort(smaller).concat(pivot).concat(quickSort(larger))
}