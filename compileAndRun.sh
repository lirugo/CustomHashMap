#!/bin/bash
packageDir="com/lirugo/hash_map/"
outputDir="target/classes/"

echo "Start compiling..."
echo "Package direrctory: $packageDir"
echo "Output direrctory: $outputDir"

javac "${packageDir}Main.java" -d $outputDir

echo "Compiled"
echo "Run"
echo "-----------"

java -cp ${outputDir} com.lirugo.hash_map.Main

echo "-----------"
echo "Done"
