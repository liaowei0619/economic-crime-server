# economic-crime-server


SSM+JPA+ASPECT

上个版本的没有aspect和jpa，
今天突发奇想查了些资料，整合了一下。感兴趣的一起学习

数据库：

CREATE TABLE `csvpartbase` (
  `id` varchar(64) NOT NULL,
  `mac` varchar(64) DEFAULT NULL,
  `ip` varchar(64) DEFAULT NULL,
  `upIp` varchar(64) DEFAULT NULL,
  `upName` varchar(32) DEFAULT NULL,
  `upIndex` varchar(64) DEFAULT NULL,
  `modifyTime` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `file_tb` (
  `file_id` varchar(64) NOT NULL,
  `file_name` varchar(64) DEFAULT NULL,
  `file_url` varchar(128) DEFAULT NULL,
  `file_md5` varchar(128) DEFAULT NULL,
  `real_Path` varchar(64) DEFAULT NULL,
  `file_Size` bigint(20) DEFAULT NULL,
  `create_Date` datetime DEFAULT NULL,
  `file_uploader` varchar(64) DEFAULT NULL,
  `file_type` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `operations` (
  `id` varchar(64) NOT NULL,
  `args` varchar(128) DEFAULT NULL,
  `classMethod` varchar(128) DEFAULT NULL,
  `ip` varchar(64) DEFAULT NULL COMMENT '操作日志',
  `method` varchar(64) DEFAULT NULL,
  `reqDateTime` datetime DEFAULT NULL,
  `reqResult` tinyint(255) DEFAULT NULL,
  `saveDateTime` datetime DEFAULT NULL,
  `url` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

