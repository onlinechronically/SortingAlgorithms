function quickSort(tbl)
    if #tbl == 0 then return {} end
    local pivot = tbl[#tbl]
    local smaller = {}
    local larger = {}
    for _,item in pairs(tbl) do
        if item > pivot then
            table.insert(larger, item)
        elseif item < pivot then
            table.insert(smaller, item)
        end
    end
    local finalArr = {}
    for _,item in pairs(quickSort(smaller)) do
        table.insert(finalArr, item)
    end
    table.insert(finalArr, pivot)
    for _,item in pairs(quickSort(larger)) do
        table.insert(finalArr, item)
    end
    return finalArr
end