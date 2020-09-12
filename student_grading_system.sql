-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 04, 2018 at 04:54 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_grading_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `gradingsystem`
--

CREATE TABLE `gradingsystem` (
  `idnum` int(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `middlename` varchar(50) NOT NULL,
  `course` varchar(50) NOT NULL,
  `year` int(50) NOT NULL,
  `subject` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gradingsystem`
--

INSERT INTO `gradingsystem` (`idnum`, `firstname`, `lastname`, `middlename`, `course`, `year`, `subject`) VALUES
(1, 'Robert', 'Ducusin', 'Plamer', 'BSIT', 3, 'Computer Programming 1'),
(2, 'Roger', 'Gersad', 'Gero', 'asd', 23, ''),
(3, 'dasdas', 'asdasds', 'dsdsad', 'BSCS', 2, '');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `un` varchar(10) NOT NULL,
  `pw` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`un`, `pw`) VALUES
('q', 'a'),
('robert', 'qwe');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `idnum` int(10) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `attendance` int(5) NOT NULL,
  `quiz` int(5) NOT NULL,
  `participation` int(5) NOT NULL,
  `project` int(5) NOT NULL,
  `finalexam` int(5) NOT NULL,
  `attitude` int(5) NOT NULL,
  `finalgrade` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`idnum`, `lastname`, `subject`, `attendance`, `quiz`, `participation`, `project`, `finalexam`, `attitude`, `finalgrade`) VALUES
(1, 'Ducusin', 'English', 1, 1, 1, 1, 1, 1, 6),
(1, 'Ducusin', 'Computer Programming 1', 1, 1, 11, 1, 1, 11, 26),
(2, 'Gersad', 'Math', 12, 34, 22, 2, 6, 5, 81);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gradingsystem`
--
ALTER TABLE `gradingsystem`
  ADD PRIMARY KEY (`idnum`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`un`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gradingsystem`
--
ALTER TABLE `gradingsystem`
  MODIFY `idnum` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
