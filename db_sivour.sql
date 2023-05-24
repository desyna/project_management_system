-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2023 at 05:54 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_sivour`
--

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `NIM` varchar(12) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Mata_Kuliah` varchar(255) NOT NULL,
  `IPS` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`NIM`, `Nama`, `Mata_Kuliah`, `IPS`) VALUES
('123210081', 'desy', 'SCPK', 'A'),
('123210082', 'nur', 'pkn', 'B'),
('123210083', 'Desy Nur Azizah', 'Pemrograman Berorientasi Object', 'A');

-- --------------------------------------------------------

--
-- Table structure for table `mhs`
--

CREATE TABLE `mhs` (
  `nama` varchar(255) NOT NULL,
  `nim` varchar(50) NOT NULL,
  `aa` varchar(2) NOT NULL,
  `aok` varchar(2) NOT NULL,
  `opk` varchar(2) NOT NULL,
  `pbo` varchar(2) NOT NULL,
  `pkn` varchar(2) NOT NULL,
  `ppbo` varchar(2) NOT NULL,
  `pscpk` varchar(2) NOT NULL,
  `rpl` varchar(2) NOT NULL,
  `scpk` varchar(2) NOT NULL,
  `techno` varchar(2) NOT NULL,
  `ips` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mhs`
--

INSERT INTO `mhs` (`nama`, `nim`, `aa`, `aok`, `opk`, `pbo`, `pkn`, `ppbo`, `pscpk`, `rpl`, `scpk`, `techno`, `ips`) VALUES
('Tegar Wibisana', '123210024', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 4),
('Muh Aditya Dwijaya', '123210027', 'B+', 'B+', 'B+', 'B+', 'B+', 'B+', 'B+', 'B+', 'B+', 'B+', 3.5);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `nama`, `username`, `password`) VALUES
(1, 'desy nur azizah', 'desyna', 'desy123'),
(2, 'Tegar Wibisana', 'gara', '123'),
(6, 'Gara Your bae', 'gara', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`NIM`);

--
-- Indexes for table `mhs`
--
ALTER TABLE `mhs`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
