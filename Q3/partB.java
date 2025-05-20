public ArrayList<Match> buildMatches(){
    ArrayList<Match> result = new ArrayList<Match>;
    if(competitorList.size() % 2 == 1){
        for(int i = 1; i < arr.length/2+1; i++){
            result.add(Match(competitorList[i], competitorList(competitorList.size() - i)));
        }
    }
    else {
        for(int i = 0; i < arr.length/2; i++){
            result.add(Match(competitorList[i], competitorList(competitorList.size() - i)));
       }
    }
    return result;
}
