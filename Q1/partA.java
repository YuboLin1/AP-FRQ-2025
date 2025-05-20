public int walkDogs(int hour) {
    int numDogs = company.numAvailableDogs(hour);
    if (maxDogs >= numDogs) {
        company.updateDogs(hour, numDogs);
        return numDogs;
    } 
    company.updateDogs(hour, maxDogs);
    return maxDogs;
}
