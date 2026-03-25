class MyCalendarTwo {
    //normal bookings 
    private List<int[]> bookings;
    //bookings that are getting double overlapped
        private List<int[]> overlapBookings;
//check if two bookings overlap
        private boolean doesOverlap(int start1,int end1,int start2,int end2)    {
            return (Math.max(start1,start2)<Math.min(end1,end2));
        }
        //return the booking getting overlapped
        private int[] getOverlapped(int start1,int end1,int start2,int end2){
            return new int[]{Math.max(start1,start2),Math.min(end1,end2)};
        }

    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlapBookings = new ArrayList<>();
        
    }
    
    public boolean book(int startTime, int endTime) {
        //if the new booking is already in the array of double overlapping bookings then return false
        for(int [] booking :overlapBookings){
            if(doesOverlap(booking[0],booking[1],startTime,endTime)){
                return false;
            }
        }
        //else we can add it to overlap bookings as it is a double overlap one
        for(int [] booking:bookings){
            if(doesOverlap(booking[0],booking[1],startTime,endTime)){
                overlapBookings.add(getOverlapped(booking[0],booking[1],startTime,endTime));
            }
        }
        //then add that booking into bookings array and return true
        bookings.add(new int[] {startTime,endTime});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */
