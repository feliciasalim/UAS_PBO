-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Jun 2024 pada 11.29
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo_db`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `activity`
--

CREATE TABLE `activity` (
  `id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `teacher_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `activity`
--

INSERT INTO `activity` (`id`, `class_id`, `course_id`, `teacher_id`) VALUES
(1, 1, 1, 1),
(2, 1, 1, 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `assignment`
--

CREATE TABLE `assignment` (
  `due_date` datetime(6) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `assignment`
--

INSERT INTO `assignment` (`due_date`, `id`) VALUES
('2024-06-24 16:26:36.000000', 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `assignment_assignee`
--

CREATE TABLE `assignment_assignee` (
  `assignment_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `assignment_assignee`
--

INSERT INTO `assignment_assignee` (`assignment_id`, `student_id`) VALUES
(2, 1),
(2, 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `class`
--

CREATE TABLE `class` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `class`
--

INSERT INTO `class` (`id`, `name`) VALUES
(1, 'Class 1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `course`
--

CREATE TABLE `course` (
  `id` int(11) NOT NULL,
  `course_code` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `course`
--

INSERT INTO `course` (`id`, `course_code`, `name`) VALUES
(1, 'CS101', 'Object-Oriented Programming');

-- --------------------------------------------------------

--
-- Struktur dari tabel `meeting`
--

CREATE TABLE `meeting` (
  `meeting_start_time` datetime(6) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `meeting`
--

INSERT INTO `meeting` (`meeting_start_time`, `id`) VALUES
('2024-06-17 16:26:36.000000', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `meeting_attendee`
--

CREATE TABLE `meeting_attendee` (
  `meeting_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `meeting_attendee`
--

INSERT INTO `meeting_attendee` (`meeting_id`, `student_id`) VALUES
(1, 1),
(1, 2),
(1, 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `score`
--

CREATE TABLE `score` (
  `id` int(11) NOT NULL,
  `value` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `score`
--

INSERT INTO `score` (`id`, `value`, `class_id`, `course_id`, `student_id`) VALUES
(1, 90, 1, 1, 1),
(2, 80, 1, 1, 2),
(3, 70, 1, 1, 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `supervisor_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `student`
--

INSERT INTO `student` (`id`, `name`, `supervisor_id`) VALUES
(1, 'Alice', 1),
(2, 'Bob', 1),
(3, 'Charlie', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `teacher`
--

CREATE TABLE `teacher` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `teacher`
--

INSERT INTO `teacher` (`id`, `name`) VALUES
(1, 'Dr. John Doe');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `activity`
--
ALTER TABLE `activity`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK401w6q3hr448chvu9w40r5nd6` (`class_id`),
  ADD KEY `FKjp674rttnqune6hnkdq27qpxu` (`course_id`),
  ADD KEY `FKip88ncs745rx1i3mp6wrhsar4` (`teacher_id`);

--
-- Indeks untuk tabel `assignment`
--
ALTER TABLE `assignment`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `assignment_assignee`
--
ALTER TABLE `assignment_assignee`
  ADD PRIMARY KEY (`assignment_id`,`student_id`),
  ADD KEY `FK4qlrrtirw1obbi7yfppa70799` (`student_id`);

--
-- Indeks untuk tabel `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `meeting`
--
ALTER TABLE `meeting`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `meeting_attendee`
--
ALTER TABLE `meeting_attendee`
  ADD PRIMARY KEY (`meeting_id`,`student_id`),
  ADD KEY `FKk31m03wiop1emyb3j7wx1x44p` (`student_id`);

--
-- Indeks untuk tabel `score`
--
ALTER TABLE `score`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK7cle8qjk3jcqctssk3741nw31` (`class_id`),
  ADD KEY `FK4r2i87mwev058q4nvnl36latl` (`course_id`),
  ADD KEY `FKnap51mbove93yjb09idc9jic6` (`student_id`);

--
-- Indeks untuk tabel `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK6uuxruf19d0fpua408o78s6lp` (`supervisor_id`);

--
-- Indeks untuk tabel `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `activity`
--
ALTER TABLE `activity`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `class`
--
ALTER TABLE `class`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `course`
--
ALTER TABLE `course`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `score`
--
ALTER TABLE `score`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `student`
--
ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `teacher`
--
ALTER TABLE `teacher`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `activity`
--
ALTER TABLE `activity`
  ADD CONSTRAINT `FK401w6q3hr448chvu9w40r5nd6` FOREIGN KEY (`class_id`) REFERENCES `class` (`id`),
  ADD CONSTRAINT `FKip88ncs745rx1i3mp6wrhsar4` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`),
  ADD CONSTRAINT `FKjp674rttnqune6hnkdq27qpxu` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);

--
-- Ketidakleluasaan untuk tabel `assignment`
--
ALTER TABLE `assignment`
  ADD CONSTRAINT `FK5hor6imm97vhhbp1wpqrnnqkc` FOREIGN KEY (`id`) REFERENCES `activity` (`id`);

--
-- Ketidakleluasaan untuk tabel `assignment_assignee`
--
ALTER TABLE `assignment_assignee`
  ADD CONSTRAINT `FK4qlrrtirw1obbi7yfppa70799` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`),
  ADD CONSTRAINT `FK9vm7fd0sqpxdidd6lxko1souo` FOREIGN KEY (`assignment_id`) REFERENCES `assignment` (`id`);

--
-- Ketidakleluasaan untuk tabel `meeting`
--
ALTER TABLE `meeting`
  ADD CONSTRAINT `FK3g5odxgi303mnek6thudpvwr5` FOREIGN KEY (`id`) REFERENCES `activity` (`id`);

--
-- Ketidakleluasaan untuk tabel `meeting_attendee`
--
ALTER TABLE `meeting_attendee`
  ADD CONSTRAINT `FKdpsg8sdfkv9hamld5jd4tqtcq` FOREIGN KEY (`meeting_id`) REFERENCES `meeting` (`id`),
  ADD CONSTRAINT `FKk31m03wiop1emyb3j7wx1x44p` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`);

--
-- Ketidakleluasaan untuk tabel `score`
--
ALTER TABLE `score`
  ADD CONSTRAINT `FK4r2i87mwev058q4nvnl36latl` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`),
  ADD CONSTRAINT `FK7cle8qjk3jcqctssk3741nw31` FOREIGN KEY (`class_id`) REFERENCES `class` (`id`),
  ADD CONSTRAINT `FKnap51mbove93yjb09idc9jic6` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`);

--
-- Ketidakleluasaan untuk tabel `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `FK6uuxruf19d0fpua408o78s6lp` FOREIGN KEY (`supervisor_id`) REFERENCES `teacher` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
