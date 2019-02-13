package io.pivotal.pal.tracker;

public interface TimeEntryRepository {

    public void insertTimeEntry();
    public void getTimeEntry();
    public void updateTimeEntry();
    public void deleteTimeEntry();

}
