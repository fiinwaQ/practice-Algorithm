kangaroo = (x1, v1, x2, v2) => {
    if (v1 == v2) {
        return (x1 == x2) ? "YES" : "NO"; 
    }
    let timeToMeet = ((x2 - x1) / (v1 - v2));
    // return (timeToMeet > 0 && (Number.parseInt(timeToMeet) == timeToMeet)) ? "YES" : "NO"; 
    return (timeToMeet > 0 && timeToMeet % 1 === 0) ? "YES" : "NO"; 
};

let lKangaroos = [
    [0, 3, 4, 2],
    [0, 2, 5, 3],
    [21, 6, 47, 3]
];
lKangaroos.map((lKangaroo) => console.log(kangaroo(...lKangaroo)))