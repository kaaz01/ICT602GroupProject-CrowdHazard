-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 19, 2023 at 10:25 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hazard`
--

-- --------------------------------------------------------

--
-- Table structure for table `crowdinfo`
--

CREATE TABLE `crowdinfo` (
  `crowdinfo_id` int(11) NOT NULL,
  `report_timestamp` datetime NOT NULL DEFAULT current_timestamp(),
  `name` varchar(225) NOT NULL,
  `hazard_type` text NOT NULL,
  `hazard_loc` varchar(225) NOT NULL,
  `hazard_desc` text NOT NULL,
  `hazard_lat` decimal(10,4) NOT NULL,
  `hazard_long` decimal(10,4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `crowdinfo`
--

INSERT INTO `crowdinfo` (`crowdinfo_id`, `report_timestamp`, `name`, `hazard_type`, `hazard_loc`, `hazard_desc`, `hazard_lat`, `hazard_long`) VALUES
(1, '2023-07-05 10:34:02', 'Khairul', 'Accident', 'Johor', 'Accident between 2 car and 1 motorcycle', '1.5381', '104.2629'),
(2, '2023-07-05 10:34:02', 'Afnan', 'Flood', 'Johor', 'flashflood because of a drain full of rubbish', '2.5204', '103.9715'),
(12, '2023-07-06 21:47:42', 'Khairul', 'Heavy Traffic', 'Gate UiTM', 'Broken traffic light', '2.2150', '104.0531'),
(13, '2023-07-06 22:24:02', 'Firdaus', 'Fire', 'Jakel', 'Short circiut', '1.4575', '103.7522'),
(14, '2023-07-07 00:12:45', 'Khairul', 'Flood', 'Shah Alam', 'Clogged Drain', '2.2150', '104.0531'),
(15, '2023-07-07 00:18:54', 'Ahmad', 'Fire', 'Raub', 'Forest Fire', '6.1200', '100.3700'),
(16, '2023-07-07 00:42:52', 'Zamakh', 'H1N1', 'Puchong', 'Bird fever', '5.2900', '100.2590'),
(17, '2023-07-07 14:25:06', 'Haziq', 'Roadblock', 'Shah alam', 'broken light pole on the road', '1.5350', '103.7980'),
(18, '2023-07-07 22:21:59', 'Khairul', 'Accident', 'Shah Alam', '2 lorry', '3.0713', '101.4899'),
(19, '2023-07-08 02:47:33', 'Luqman', 'Heavy Rain', 'UiTM ', 'Possible to flood', '3.0698', '101.5037'),
(20, '2023-07-08 02:51:43', 'Hazzeem', 'Landslide', 'Flat PKNS', 'Closed Road', '3.0705', '101.4842'),
(21, '2023-07-13 12:33:02', 'Khairul', 'Roadblock', 'Jakel Shah Alam', 'License check', '3.0738', '101.4911');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `crowdinfo`
--
ALTER TABLE `crowdinfo`
  ADD PRIMARY KEY (`crowdinfo_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `crowdinfo`
--
ALTER TABLE `crowdinfo`
  MODIFY `crowdinfo_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
