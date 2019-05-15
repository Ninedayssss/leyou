package com.leyou.upload.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author itsNine
 * @create 2019-03-30 16:57
 */
@Data
@ConfigurationProperties(prefix = "ly.upload")
public class UploadProperties {
	private String baseUrl;
	private List<String> allowTypes;
}
