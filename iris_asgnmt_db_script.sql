
-- Use for owner-information-service microservice
CREATE DATABASE owner_information;

CREATE TABLE IF NOT EXISTS owner_info (
    ownerId INT AUTO_INCREMENT PRIMARY KEY,
    cardId INT NOT NULL,
    ownerName VARCHAR(255) NOT NULL,
    unit VARCHAR(20),
    status VARCHAR(20)
)  ENGINE=INNODB;

INSERT INTO owner_info (cardId, ownerName, unit, status) 
VALUES (1, "Abu", "J-1-12", "owner"); 

INSERT INTO owner_info (cardId, ownerName, unit, status) 
VALUES (2, "Ali", "A-1-12", "rent"); 

INSERT INTO owner_info (cardId, ownerName, unit, status) 
VALUES (3, "Asan", "C-1-12", "owner"); 

INSERT INTO owner_info (cardId, ownerName, unit, status) 
VALUES (4, "Alimran", "D-1-12", "rent"); 

INSERT INTO owner_info (cardId, ownerName, unit, status) 
VALUES (5, "Mustakim", "J-1-2", "owner"); 

-- Use for booking-visit-service microservice
CREATE DATABASE booking_information;

CREATE TABLE `booking_information`.`booking_detail` (
	`bookingId` INT NOT NULL AUTO_INCREMENT,
	`bookingBy` VARCHAR(45) NULL,
	`visitorId` INT NULL,
	`reason` VARCHAR(100) NULL,
	PRIMARY KEY (`bookingId`));

INSERT INTO booking_detail (bookingId, bookingBy, visitorId, reason) 
VALUES (100, "Ahmad", 54, "Visiting family") ;

INSERT INTO booking_detail (bookingId, bookingBy, visitorId, reason)
VALUES (102, "Salleh", 50, "Visiting family") ;

INSERT INTO booking_detail (bookingId, bookingBy, visitorId, reason) 
VALUES (103, "Kassim", 51, "Drop people") ;

INSERT INTO booking_detail (bookingId, bookingBy, visitorId, reason) 
VALUES (104, "Salleh", 52, "Water filter service") ;

INSERT INTO booking_detail (bookingId, bookingBy, visitorId, reason) 
VALUES (105, "Kassim", 53, "Kenduri") ;

-- Use for booking-visit-service microservice
CREATE TABLE `booking_information`.`visitor_information` (
	`visitorId` INT NOT NULL,
	`visitorName` VARCHAR(45) NULL,
	`plateNumber` VARCHAR(45) NULL,
	`ownerId` INT NULL,
	PRIMARY KEY (`visitorId`));

INSERT INTO visitor_information (visitorId, visitorName, plateNumber, ownerId) 
VALUES (50, "Mark", "PPP1111", 1) ;

INSERT INTO visitor_information (visitorId, visitorName, plateNumber, ownerId) 
VALUES (51, "Anthony", "PPP1213", 2) ;

INSERT INTO visitor_information (visitorId, visitorName, plateNumber, ownerId)  
VALUES (52, "Michael", "PPP1223", 3) ;

INSERT INTO visitor_information (visitorId, visitorName, plateNumber, ownerId)  
VALUES (53, "Richard", "XA1234", 4) ;

INSERT INTO visitor_information (visitorId, visitorName, plateNumber, ownerId)  
VALUES (54, "Semporna", "XA1234B", 5) ;