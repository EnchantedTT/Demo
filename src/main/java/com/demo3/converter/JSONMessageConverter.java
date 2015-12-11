package com.demo3.converter;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.net.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class JSONMessageConverter implements HttpMessageConverter<Object> {
    private              List<MediaType> supportedMediaTypes = Lists.newArrayList(MediaType.ALL);
    private final static String          JSON_UTF8           = com.google.common.net.MediaType.JSON_UTF_8.toString();

    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return false;
    }

    @Override
    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        return true;
    }

    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return supportedMediaTypes;
    }

    @Override
    public Object read(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    public void write(Object o, MediaType contentType, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
//        byte[] json;
//        if (o instanceof Writeable) {
//            json = ((Writeable) o).toJson().getBytes(Charsets.UTF_8);
//        } else {
//            json = JSON.safeToJson(o).getBytes(Charsets.UTF_8);
//
//        }
//        outputMessage.getHeaders().setContentLength(json.length);
//        outputMessage.getHeaders().set(HttpHeaders.CONTENT_TYPE, JSON_UTF8);
//        try {
//            OutputStream os = outputMessage.getBody();
//            os.write(json);
//            os.flush();
//        } catch (IOException ignore) {
//        }
    }
}
