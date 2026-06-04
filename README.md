
# Directed Graph Analyser 🔍

A Java implementation of cycle detection in directed graphs using two approaches — DFS traversal and Sink Elimination algorithm.

## Features

- 📂 Parse graph edges from a text file
- 🔄 Detect cycles using recursive DFS
- 🔁 Check if graph is acyclic using Sink Elimination
- 🖨️ Print adjacency list representation

## How It Works

**DFS Cycle Detection**
Traverses the graph recursively tracking the current path. If a neighbour is already in the current path, a cycle is found and returned.

**Sink Elimination**
Repeatedly removes sink vertices (vertices with no outgoing edges). If the graph empties, it is acyclic. If no sink is found but the graph is not empty, a cycle exists.

## How It Works

**DFS Cycle Detection**
Traverses the graph recursively tracking the current path. If a neighbour is already in the current path, a cycle is found and returned. Works on both directed and undirected graphs.

**Sink Elimination**
Repeatedly removes sink vertices (vertices with no outgoing edges). If the graph empties, it is acyclic. If no sink is found but the graph is not empty, a cycle exists. Applied on directed graphs only.

## Input File Format

**Directed Graph** — each line contains two integers representing a directed edge:
1 2
2 3
3 1

**Undirected Graph** — each edge is represented once, treated as bidirectional:
1 2
2 3
3 4

Just replace those two sections and push!

## Tech Stack

**Language:** Java

**Data Structures:** HashMap, ArrayList, HashSet

## Author

Built by [Sai Pradeep](https://github.com/saipradeeptlk-a11y)
