package com.my.app.cloud;

import java.util.Set;

import org.jclouds.ContextBuilder;
import org.jclouds.logging.slf4j.config.SLF4JLoggingModule;
import org.jclouds.openstack.glance.v1_0.GlanceApi;
import org.jclouds.openstack.glance.v1_0.domain.Image;
import org.jclouds.openstack.glance.v1_0.domain.ImageDetails;
import org.jclouds.openstack.glance.v1_0.features.ImageApi;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Module;

public class Test1 {
	
	private final GlanceApi glanceApi;
    private final Set<String> regions;

	public Test1() {
		ImmutableSet<Module> modules = ImmutableSet.<Module>of(new SLF4JLoggingModule());
		
		String provider = "openstack-glance";
        String identity = "demo:demo"; // tenantName:userName
        String credential = "devstack";

        glanceApi = ContextBuilder.newBuilder(provider)
                .endpoint("http://xxx.xxx.xxx.xxx:5000/v2.0/")
                .credentials(identity, credential)
                .modules(modules)
                .buildApi(GlanceApi.class);
        regions = glanceApi.getConfiguredRegions();
        
        ImageApi imageApi = glanceApi.getImageApi("");
        
        FluentIterable<Image> image = imageApi.list().concat();
        FluentIterable<ImageDetails> imageDetails = imageApi.listInDetail().concat();
	}
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
	}
	
}
