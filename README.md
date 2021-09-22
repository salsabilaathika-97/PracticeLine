# Line

## Problem Statement

This library calculate the distance between 2 points on a Cartesian diagram with input from the user.
The input is a 2 point, namely (x1, y1) and (x2, y2).
The output from this program is the distance between the two point.

## Prerequisites

- jdk 11.0.12
- junit 5.7.0
- gradle 7.1

## Instructions

### How to Test

1. `./gradlew test`

### How to Build

1. Type `./gradlew jar`
2. Get your jar library at `/lib/build/libs/rm-rf-line-1.0-SNAPSHOT.jar`

### Importing the Library

1. Copy the .jar file to your project `/libs` directory
2. Add this line to make your project implement all the library in `/libs` directory
```
dependencies {
    ...
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    ...
}
```
3. Type `./gradlew build` to build the gradle file
