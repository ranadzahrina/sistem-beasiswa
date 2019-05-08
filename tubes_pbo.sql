-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Bulan Mei 2019 pada 21.43
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubes_pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_beasiswa`
--

CREATE TABLE `data_beasiswa` (
  `judul` varchar(30) NOT NULL,
  `isi` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_mahasiswa`
--

CREATE TABLE `data_mahasiswa` (
  `nama` varchar(25) NOT NULL,
  `nim` int(10) NOT NULL,
  `prodi` varchar(20) NOT NULL,
  `ttl` text NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `alamat` text NOT NULL,
  `kode_pos` int(5) NOT NULL,
  `telepon` int(13) NOT NULL,
  `tempat_tinggal` varchar(15) NOT NULL,
  `agama` varchar(15) NOT NULL,
  `status` varchar(15) NOT NULL,
  `semester` int(2) NOT NULL,
  `ipk` float NOT NULL,
  `nama_ayah` varchar(25) NOT NULL,
  `kerja_ayah` varchar(15) NOT NULL,
  `gaji_ayah` int(7) NOT NULL,
  `nama_ibu` varchar(25) NOT NULL,
  `kerja_ibu` varchar(15) NOT NULL,
  `gaji_ibu` int(7) NOT NULL,
  `alamat_ortu` text NOT NULL,
  `kodepos_ortu` int(5) NOT NULL,
  `telpon_ortu` int(13) NOT NULL,
  `jumlah_anak` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_mahasiswa`
--

INSERT INTO `data_mahasiswa` (`nama`, `nim`, `prodi`, `ttl`, `jenis_kelamin`, `alamat`, `kode_pos`, `telepon`, `tempat_tinggal`, `agama`, `status`, `semester`, `ipk`, `nama_ayah`, `kerja_ayah`, `gaji_ayah`, `nama_ibu`, `kerja_ibu`, `gaji_ibu`, `alamat_ortu`, `kodepos_ortu`, `telpon_ortu`, `jumlah_anak`) VALUES
('D', 1, 'd', 'd', 'd', 'd', 0, 0, 'dd', 'd', 'd', 0, 0, 'dd', 'd', 0, 'd', 'dd', 0, 'd', 0, 0, 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabel_login`
--

CREATE TABLE `tabel_login` (
  `id` int(3) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `usertype` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tabel_login`
--

INSERT INTO `tabel_login` (`id`, `username`, `password`, `usertype`) VALUES
(1, 'admin', 'admin', 'admin'),
(2, 'mahasiswa', 'mahasiswa', 'mahasiswa');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_beasiswa`
--
ALTER TABLE `data_beasiswa`
  ADD PRIMARY KEY (`judul`);

--
-- Indeks untuk tabel `data_mahasiswa`
--
ALTER TABLE `data_mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indeks untuk tabel `tabel_login`
--
ALTER TABLE `tabel_login`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
