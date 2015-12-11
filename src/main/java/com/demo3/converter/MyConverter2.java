package com.demo3.converter;

import com.demo3.model.Blog;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by lichangjie on 03/12/2015.
 */
public class MyConverter2 extends AbstractHttpMessageConverter<Blog>{


    public MyConverter2() {
        super(new MediaType("application", "x-myType", Charset.forName("UTF-8")));
    }

    @Override
    protected boolean supports(Class<? extends Object> aClass) {
        return Object.class.isAssignableFrom(aClass);
    }

    @Override
    protected Blog readInternal(Class<? extends Blog> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(httpInputMessage.getBody(), Charset.forName("UTF-8"));
        String[] arr = temp.split("~");
        return new Blog(arr[0], arr[1], arr[2]);
    }

    @Override
    protected void writeInternal(Blog blog, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "hello!" + blog.toString();
        httpOutputMessage.getBody().write(out.getBytes());
    }
}
