
CREATE TABLE `tbl_hotel` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `website` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `address_doc` varchar(100) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `flag_sheet` text,
  `tel` varchar(45) DEFAULT NULL,
  `fax` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `contact_person` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `flag_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_hotel_price` (
  `id` int(11) NOT NULL,
  `year_price` varchar(10) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `room_type` varchar(100) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `flag_status` varchar(45) DEFAULT NULL,
  `flag_extra_price` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_place` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `website` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `address_doc` varchar(100) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `flag_sheet` text,
  `tel` varchar(45) DEFAULT NULL,
  `fax` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `contact_person` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `flag_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_place_price` (
  `id` int(11) NOT NULL,
  `year_price` varchar(10) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `room_type` varchar(100) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `flag_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_restaurant` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `website` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `address_doc` varchar(100) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `flag_sheet` text,
  `tel` varchar(45) DEFAULT NULL,
  `fax` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `contact_person` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `flag_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_restaurant_price` (
  `id` int(11) NOT NULL,
  `year_price` varchar(10) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `room_type` varchar(100) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `flag_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_show` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `website` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `address_doc` varchar(100) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `flag_sheet` text,
  `tel` varchar(45) DEFAULT NULL,
  `fax` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `contact_person` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `flag_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_show_price` (
  `id` int(11) NOT NULL,
  `year_price` varchar(10) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `room_type` varchar(100) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `flag_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_transport` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `website` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `address_doc` varchar(100) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `flag_sheet` text,
  `tel` varchar(45) DEFAULT NULL,
  `fax` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `contact_person` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `flag_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_transport_price` (
  `id` int(11) NOT NULL,
  `year_price` varchar(10) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `room_type` varchar(100) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `flag_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
