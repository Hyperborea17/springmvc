-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Anamakine: localhost
-- Üretim Zamanı: 11 Ağu 2020, 20:54:17
-- Sunucu sürümü: 5.7.17-log
-- PHP Sürümü: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `test`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `bilgiler`
--

CREATE TABLE `bilgiler` (
  `id` int(11) NOT NULL,
  `isim_soyadi` text NOT NULL,
  `tc_kimlik` text NOT NULL,
  `adres` text NOT NULL,
  `e_posta` text NOT NULL,
  `telefon` text NOT NULL,
  `dogumtarihi` text NOT NULL,
  `perakende_cevap` text NOT NULL,
  `tercih_sebebi` text NOT NULL,
  `yer_tercihi` text NOT NULL,
  `yatirim_miktari` float NOT NULL,
  `ek_text` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `bilgiler`
--
ALTER TABLE `bilgiler`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `bilgiler`
--
ALTER TABLE `bilgiler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=69;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
