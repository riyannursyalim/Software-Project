-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 28, 2016 at 10:15 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `medica`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` varchar(700) NOT NULL,
  `password` varchar(700) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `password`) VALUES
('chandra', '1302144087'),
('radika', '1302140152'),
('riyan', '1302140142');

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `kd_dokter` varchar(8) NOT NULL,
  `nm_dokter` varchar(40) NOT NULL,
  `jk` enum('Laki-laki','Perempuan') NOT NULL,
  `tmp_lahir` varchar(15) NOT NULL,
  `tgl_lahir` date DEFAULT NULL,
  `gol_drh` enum('A','B','O','AB','-') NOT NULL,
  `agama` enum('Islam','Katolik','Kristen','Hindu','Budha','Lainnya') NOT NULL,
  `almt_tgl` varchar(60) NOT NULL,
  `no_telp` varchar(13) NOT NULL,
  `stts_nikah` enum('Single','Menikah','-') NOT NULL,
  `alumni` varchar(60) NOT NULL,
  `no_ijin_praktek` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`kd_dokter`, `nm_dokter`, `jk`, `tmp_lahir`, `tgl_lahir`, `gol_drh`, `agama`, `almt_tgl`, `no_telp`, `stts_nikah`, `alumni`, `no_ijin_praktek`) VALUES
('1', 'Dr Riyan', 'Perempuan', 'Tangerang', '1996-02-26', 'B', 'Islam', 'bandung', '098754', 'Single', 'Telkom University', '1302140142'),
('2', 'Dr. Radika', 'Laki-laki', 'pontianak', '1996-06-03', 'A', 'Islam', 'bandung', '09', 'Single', 'Telkom University', '130214152'),
('3', 'Dr. Chun', 'Laki-laki', 'Jakarta', '1996-04-22', 'AB', 'Islam', 'bandung', '098754323', 'Single', 'Telkom University', '1302144087');

-- --------------------------------------------------------

--
-- Table structure for table `imunisasi`
--

CREATE TABLE `imunisasi` (
  `kd_imunisasi` varchar(5) NOT NULL,
  `nm_imunisasi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `imunisasi`
--

INSERT INTO `imunisasi` (`kd_imunisasi`, `nm_imunisasi`) VALUES
('1', 'lebih kuat'),
('2', 'larinya cepat'),
('3', 'kebal benda tajam');

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `kd_kamar` varchar(5) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `nm_kamar` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kamar`
--

INSERT INTO `kamar` (`kd_kamar`, `kelas`, `nm_kamar`) VALUES
('1', 'VVIP', 'apartemen'),
('2', 'Ekonomi', 'hotel'),
('3', 'Ekonomi2', 'kolong jembatan'),
('4', 'bpjs', 'kuburan');

-- --------------------------------------------------------

--
-- Table structure for table `pasien_bayi`
--

CREATE TABLE `pasien_bayi` (
  `no_rm_bayi` varchar(10) NOT NULL,
  `no_rm_ibu` varchar(10) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `jam` time NOT NULL,
  `umur` varchar(6) NOT NULL,
  `proses_lahir` varchar(15) NOT NULL,
  `j_kel` enum('Laki-laki','Perempuan') NOT NULL,
  `berat_badan` varchar(12) NOT NULL,
  `panjang_badan` varchar(10) NOT NULL,
  `lingkar_kepala` varchar(8) NOT NULL,
  `tgl_daftar` date NOT NULL,
  `keterangan` varchar(60) NOT NULL,
  `anakke` char(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien_bayi`
--

INSERT INTO `pasien_bayi` (`no_rm_bayi`, `no_rm_ibu`, `tgl_lahir`, `jam`, `umur`, `proses_lahir`, `j_kel`, `berat_badan`, `panjang_badan`, `lingkar_kepala`, `tgl_daftar`, `keterangan`, `anakke`) VALUES
('1', '1', '2013-06-01', '03:00:06', '1', 'ditarik', 'Laki-laki', '89', '11', '1', '2013-06-03', 'lancar jaya', '1'),
('2', '3', '2013-06-01', '00:00:06', '11', 'keluar sendiri', 'Perempuan', '14', '11', '1', '2013-06-03', 'kaget', '3');

-- --------------------------------------------------------

--
-- Table structure for table `pasien_ibu`
--

CREATE TABLE `pasien_ibu` (
  `no_rm_ibu` varchar(11) NOT NULL,
  `nm_pasien` varchar(40) NOT NULL,
  `suami` varchar(40) NOT NULL,
  `umur` char(2) NOT NULL,
  `alergi_obat` varchar(40) NOT NULL,
  `stts_ingin` enum('Ingin Anak','Tidak') NOT NULL,
  `alamat` varchar(60) NOT NULL,
  `gol_drh` enum('A','B','O','AB','-') NOT NULL,
  `pekerjaan` varchar(15) NOT NULL,
  `agama` varchar(12) NOT NULL,
  `tgl_daftar` date NOT NULL,
  `diagnosa_awal` varchar(100) NOT NULL,
  `pnddkn` enum('TS','SD','SMP','SMA','SMK','D1','D2','D3','D4','S1','S2','S3','-') NOT NULL,
  `stts_nikah` enum('Single','Menikah','Janda') NOT NULL,
  `no_telp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien_ibu`
--

INSERT INTO `pasien_ibu` (`no_rm_ibu`, `nm_pasien`, `suami`, `umur`, `alergi_obat`, `stts_ingin`, `alamat`, `gol_drh`, `pekerjaan`, `agama`, `tgl_daftar`, `diagnosa_awal`, `pnddkn`, `stts_nikah`, `no_telp`) VALUES
('1', 'riyan', 'null', '20', 'sianida', 'Ingin Anak', 'bandung', 'B', 'mahasiswa', 'islam', '2013-06-19', 'galau', 'S3', 'Menikah', '08990053564'),
('2', 'radika', 'null', '40', 'baygon', 'Ingin Anak', 'bandung', 'AB', 'mahasiswa', 'islam', '2013-06-03', 'patah hati', 'S2', 'Single', '0'),
('3', 'chandra', 'null', '90', 'jamu', 'Tidak', 'bandung', 'A', 'mahasiswa', 'islam', '2013-06-19', 'asem urat', 'S2', 'Janda', '0812345345');

-- --------------------------------------------------------

--
-- Table structure for table `pasien_mati_bayi`
--

CREATE TABLE `pasien_mati_bayi` (
  `tanggal` date NOT NULL,
  `jam` time NOT NULL,
  `no_rm_bayi` varchar(10) NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien_mati_bayi`
--

INSERT INTO `pasien_mati_bayi` (`tanggal`, `jam`, `no_rm_bayi`, `keterangan`) VALUES
('2013-06-04', '06:00:00', '1', 'sesek napas'),
('2013-06-04', '06:00:00', '2', 'darah tinggi');

-- --------------------------------------------------------

--
-- Table structure for table `pasien_mati_ibu`
--

CREATE TABLE `pasien_mati_ibu` (
  `tanggal` date NOT NULL,
  `jam` time NOT NULL,
  `no_rm_ibu` varchar(10) NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien_mati_ibu`
--

INSERT INTO `pasien_mati_ibu` (`tanggal`, `jam`, `no_rm_ibu`, `keterangan`) VALUES
('2013-06-03', '07:00:00', '1', 'kepeleset jatoh'),
('2013-06-04', '07:00:00', '2', 'diceraikan suaminya');

-- --------------------------------------------------------

--
-- Table structure for table `penyakit`
--

CREATE TABLE `penyakit` (
  `kd_icd` varchar(20) NOT NULL,
  `nama_penyakit` varchar(100) NOT NULL,
  `jenis` enum('Ranap Ibu','Ralan Ibu','Ranap Bayi','Ralan Bayi','Ranap Umum','Ralan Umum') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penyakit`
--

INSERT INTO `penyakit` (`kd_icd`, `nama_penyakit`, `jenis`) VALUES
('1', 'galau', 'Ranap Ibu'),
('2', 'patah hati', 'Ranap Umum');

-- --------------------------------------------------------

--
-- Table structure for table `rawat_inap_bayi`
--

CREATE TABLE `rawat_inap_bayi` (
  `no` int(11) NOT NULL,
  `no_rm_bayi` varchar(10) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_pulang` date NOT NULL,
  `lama` varchar(15) NOT NULL,
  `kd_kamar` varchar(5) NOT NULL,
  `kd_icd` varchar(20) NOT NULL,
  `kd_dokter` varchar(8) NOT NULL,
  `kode_tindakan` varchar(5) NOT NULL,
  `suhu_tubuh` char(2) NOT NULL,
  `resusitas` varchar(20) NOT NULL,
  `hasil` varchar(300) NOT NULL,
  `keterangan` varchar(40) NOT NULL,
  `apgar` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rawat_inap_ibu`
--

CREATE TABLE `rawat_inap_ibu` (
  `no` int(11) NOT NULL,
  `no_rm_ibu` varchar(15) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_pulang` date NOT NULL,
  `lama` varchar(15) NOT NULL,
  `kd_kamar` varchar(5) NOT NULL,
  `kd_icd` varchar(20) NOT NULL,
  `kd_dokter` varchar(8) NOT NULL,
  `kode_tindakan` varchar(5) NOT NULL,
  `suhu_tubuh` char(2) NOT NULL,
  `tensi` varchar(10) NOT NULL,
  `hasil` varchar(300) NOT NULL,
  `keterangan` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rawat_inap_ibu`
--

INSERT INTO `rawat_inap_ibu` (`no`, `no_rm_ibu`, `tgl_masuk`, `tgl_pulang`, `lama`, `kd_kamar`, `kd_icd`, `kd_dokter`, `kode_tindakan`, `suhu_tubuh`, `tensi`, `hasil`, `keterangan`) VALUES
(1, '1', '2016-04-13', '2016-04-22', '', '1', '2', '1', '2', '45', '32', 'sehat wal afiat', 'boleh kabur'),
(2, '3', '2016-04-19', '2016-04-28', '5', '3', '1', '2', '2', '45', '32', 'sehat wal afiat', 'boleh kabur');

-- --------------------------------------------------------

--
-- Table structure for table `rawat_jl_bayi`
--

CREATE TABLE `rawat_jl_bayi` (
  `no` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `no_rm_bayi` varchar(10) NOT NULL,
  `kd_dokter` varchar(8) NOT NULL,
  `kd_icd` varchar(20) NOT NULL,
  `kd_tindakan` varchar(5) NOT NULL,
  `suhu_tubuh` char(2) NOT NULL,
  `tensi` char(3) NOT NULL,
  `hasil` varchar(300) NOT NULL,
  `keterangan` varchar(40) NOT NULL,
  `kd_imunisasi` varchar(5) NOT NULL,
  `imunke` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rawat_jl_bayi`
--

INSERT INTO `rawat_jl_bayi` (`no`, `tanggal`, `no_rm_bayi`, `kd_dokter`, `kd_icd`, `kd_tindakan`, `suhu_tubuh`, `tensi`, `hasil`, `keterangan`, `kd_imunisasi`, `imunke`) VALUES
(1, '2013-06-24', '1', '2', '2', '1', '30', '120', 'sip', 'oke', '2', '1');

-- --------------------------------------------------------

--
-- Table structure for table `rawat_jl_ibu`
--

CREATE TABLE `rawat_jl_ibu` (
  `no` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `no_rm_ibu` varchar(10) NOT NULL,
  `kd_dokter` varchar(8) NOT NULL,
  `kd_icd` varchar(20) NOT NULL,
  `kode_tindakan` varchar(5) NOT NULL,
  `suhu_tubuh` char(2) NOT NULL,
  `tensi` char(10) NOT NULL,
  `hasil` varchar(300) NOT NULL,
  `keterangan` varchar(40) NOT NULL,
  `biaya` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tindakan`
--

CREATE TABLE `tindakan` (
  `kode_tindakan` varchar(5) NOT NULL,
  `nama_tindakan` varchar(100) NOT NULL,
  `diagnosa` varchar(200) NOT NULL,
  `jenis` enum('Ranap Ibu','Ralan Ibu','Ranap Bayi','Ralan Bayi','Ranap Umum','Ralan Umum') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tindakan`
--

INSERT INTO `tindakan` (`kode_tindakan`, `nama_tindakan`, `diagnosa`, `jenis`) VALUES
('1', 'Cek Darah', 'darahnya abis', 'Ranap Bayi'),
('2', 'dipijit', 'asem urat', 'Ralan Bayi'),
('3', 'Operasi', 'keseleo', 'Ranap Ibu'),
('4', 'Operasi Ringan', 'masuk angin', 'Ranap Ibu');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`kd_dokter`);

--
-- Indexes for table `imunisasi`
--
ALTER TABLE `imunisasi`
  ADD PRIMARY KEY (`kd_imunisasi`);

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`kd_kamar`);

--
-- Indexes for table `pasien_bayi`
--
ALTER TABLE `pasien_bayi`
  ADD PRIMARY KEY (`no_rm_bayi`),
  ADD KEY `no_rm_ibu` (`no_rm_ibu`);

--
-- Indexes for table `pasien_ibu`
--
ALTER TABLE `pasien_ibu`
  ADD PRIMARY KEY (`no_rm_ibu`);

--
-- Indexes for table `pasien_mati_bayi`
--
ALTER TABLE `pasien_mati_bayi`
  ADD PRIMARY KEY (`no_rm_bayi`);

--
-- Indexes for table `pasien_mati_ibu`
--
ALTER TABLE `pasien_mati_ibu`
  ADD PRIMARY KEY (`no_rm_ibu`);

--
-- Indexes for table `penyakit`
--
ALTER TABLE `penyakit`
  ADD PRIMARY KEY (`kd_icd`);

--
-- Indexes for table `rawat_inap_bayi`
--
ALTER TABLE `rawat_inap_bayi`
  ADD PRIMARY KEY (`no`),
  ADD KEY `no_rm_bayi` (`no_rm_bayi`),
  ADD KEY `kd_kamar` (`kd_kamar`),
  ADD KEY `kd_icd` (`kd_icd`),
  ADD KEY `kd_dokter` (`kd_dokter`),
  ADD KEY `kode_tindakan` (`kode_tindakan`);

--
-- Indexes for table `rawat_inap_ibu`
--
ALTER TABLE `rawat_inap_ibu`
  ADD PRIMARY KEY (`no`),
  ADD KEY `no_rm_ibu` (`no_rm_ibu`),
  ADD KEY `kd_icd` (`kd_icd`),
  ADD KEY `kd_dokter` (`kd_dokter`),
  ADD KEY `kode_tindakan` (`kode_tindakan`),
  ADD KEY `kd_kamar` (`kd_kamar`);

--
-- Indexes for table `rawat_jl_bayi`
--
ALTER TABLE `rawat_jl_bayi`
  ADD PRIMARY KEY (`no`),
  ADD KEY `no_rm_bayi` (`no_rm_bayi`),
  ADD KEY `kd_dokter` (`kd_dokter`),
  ADD KEY `kd_icd` (`kd_icd`),
  ADD KEY `kd_tindakan` (`kd_tindakan`),
  ADD KEY `kd_imunisasi` (`kd_imunisasi`);

--
-- Indexes for table `rawat_jl_ibu`
--
ALTER TABLE `rawat_jl_ibu`
  ADD PRIMARY KEY (`no`),
  ADD KEY `no_rm_ibu` (`no_rm_ibu`),
  ADD KEY `kd_dokter` (`kd_dokter`),
  ADD KEY `kd_icd` (`kd_icd`),
  ADD KEY `kode_tindakan` (`kode_tindakan`);

--
-- Indexes for table `tindakan`
--
ALTER TABLE `tindakan`
  ADD PRIMARY KEY (`kode_tindakan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pasien_bayi`
--
ALTER TABLE `pasien_bayi`
  ADD CONSTRAINT `pasien_bayi_ibfk_1` FOREIGN KEY (`no_rm_ibu`) REFERENCES `pasien_ibu` (`no_rm_ibu`) ON UPDATE CASCADE;

--
-- Constraints for table `pasien_mati_bayi`
--
ALTER TABLE `pasien_mati_bayi`
  ADD CONSTRAINT `pasien_mati_bayi_ibfk_1` FOREIGN KEY (`no_rm_bayi`) REFERENCES `pasien_bayi` (`no_rm_bayi`) ON UPDATE CASCADE;

--
-- Constraints for table `pasien_mati_ibu`
--
ALTER TABLE `pasien_mati_ibu`
  ADD CONSTRAINT `pasien_mati_ibu_ibfk_1` FOREIGN KEY (`no_rm_ibu`) REFERENCES `pasien_ibu` (`no_rm_ibu`) ON UPDATE CASCADE;

--
-- Constraints for table `rawat_inap_bayi`
--
ALTER TABLE `rawat_inap_bayi`
  ADD CONSTRAINT `rawat_inap_bayi_ibfk_2` FOREIGN KEY (`no_rm_bayi`) REFERENCES `pasien_bayi` (`no_rm_bayi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inap_bayi_ibfk_3` FOREIGN KEY (`kd_kamar`) REFERENCES `kamar` (`kd_kamar`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inap_bayi_ibfk_4` FOREIGN KEY (`kd_icd`) REFERENCES `penyakit` (`kd_icd`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inap_bayi_ibfk_6` FOREIGN KEY (`kode_tindakan`) REFERENCES `tindakan` (`kode_tindakan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inap_bayi_ibfk_7` FOREIGN KEY (`kd_dokter`) REFERENCES `dokter` (`kd_dokter`) ON UPDATE CASCADE;

--
-- Constraints for table `rawat_inap_ibu`
--
ALTER TABLE `rawat_inap_ibu`
  ADD CONSTRAINT `rawat_inap_ibu_ibfk_1` FOREIGN KEY (`no_rm_ibu`) REFERENCES `pasien_ibu` (`no_rm_ibu`) ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inap_ibu_ibfk_2` FOREIGN KEY (`kd_kamar`) REFERENCES `kamar` (`kd_kamar`) ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inap_ibu_ibfk_3` FOREIGN KEY (`kd_icd`) REFERENCES `penyakit` (`kd_icd`) ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inap_ibu_ibfk_4` FOREIGN KEY (`kd_dokter`) REFERENCES `dokter` (`kd_dokter`) ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inap_ibu_ibfk_5` FOREIGN KEY (`kode_tindakan`) REFERENCES `tindakan` (`kode_tindakan`) ON UPDATE CASCADE;

--
-- Constraints for table `rawat_jl_bayi`
--
ALTER TABLE `rawat_jl_bayi`
  ADD CONSTRAINT `rawat_jl_bayi_ibfk_2` FOREIGN KEY (`no_rm_bayi`) REFERENCES `pasien_bayi` (`no_rm_bayi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_bayi_ibfk_3` FOREIGN KEY (`kd_dokter`) REFERENCES `dokter` (`kd_dokter`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_bayi_ibfk_4` FOREIGN KEY (`kd_icd`) REFERENCES `penyakit` (`kd_icd`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_bayi_ibfk_5` FOREIGN KEY (`kd_tindakan`) REFERENCES `tindakan` (`kode_tindakan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_bayi_ibfk_6` FOREIGN KEY (`kd_imunisasi`) REFERENCES `imunisasi` (`kd_imunisasi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rawat_jl_ibu`
--
ALTER TABLE `rawat_jl_ibu`
  ADD CONSTRAINT `rawat_jl_ibu_ibfk_2` FOREIGN KEY (`no_rm_ibu`) REFERENCES `pasien_ibu` (`no_rm_ibu`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_ibu_ibfk_3` FOREIGN KEY (`kd_dokter`) REFERENCES `dokter` (`kd_dokter`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_ibu_ibfk_4` FOREIGN KEY (`kd_icd`) REFERENCES `penyakit` (`kd_icd`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_ibu_ibfk_5` FOREIGN KEY (`kode_tindakan`) REFERENCES `tindakan` (`kode_tindakan`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
