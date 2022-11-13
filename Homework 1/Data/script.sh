#!/bin/bash
awk -F"," '$5=="Skopje" {print}' Data.csv > FilteredOnlyCitySkopje.csv
awk -F"," '$5=="Skopje" && $10=="Bank" {print}' Data.csv > FilteredOnlyCitySkopjeBANKS.csv
awk -F"," '$5=="Skopje" && $10=="ATM" {print}' Data.csv > FilteredOnlyCitySkopjeATMS.csv


