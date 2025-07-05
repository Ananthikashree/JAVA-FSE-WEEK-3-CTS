package com.library;

import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    public void performTask() {
        System.out.println("Performing library task...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
