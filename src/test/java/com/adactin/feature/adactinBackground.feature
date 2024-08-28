@BackgroundExample
Feature: To explain the usage of background

Background: Student Completed School Education
#we can use only one background for one feature file
#and bg is used to run some cases before to the every Scenario and with this we cannot run after to any of the scenarios

Given the Student Finished High School
Given the Student Finished Higher Secondary

Scenario: To study medicine
 			Given the Student Applied For The Medical Course
 			When the Student Cleared The Entrance Exam
 			Then the Student Is Eligible For Joining Any Medical Institute
 
Scenario: To study Engineering
		Given the Student Applied For The Engineering Course
		When the Student Has A Sayable Cut Off
		Then the Student Is Eligible For Joining Any Engineering Institute 
