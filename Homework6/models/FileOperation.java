package Homework6.models;

import java.util.List;

import task03.Node;

public interface FileOperation {
    public List<String> readAllLines();

    public void saveAllLines(List<String> lines);
}