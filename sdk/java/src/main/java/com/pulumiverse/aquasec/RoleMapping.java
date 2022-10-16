// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.aquasec.RoleMappingArgs;
import com.pulumiverse.aquasec.Utilities;
import com.pulumiverse.aquasec.inputs.RoleMappingState;
import com.pulumiverse.aquasec.outputs.RoleMappingOauth2;
import com.pulumiverse.aquasec.outputs.RoleMappingOpenid;
import com.pulumiverse.aquasec.outputs.RoleMappingSaml;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aquasec.RoleMapping;
 * import com.pulumi.aquasec.RoleMappingArgs;
 * import com.pulumi.aquasec.inputs.RoleMappingSamlArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var roleMappingRoleMapping = new RoleMapping(&#34;roleMappingRoleMapping&#34;, RoleMappingArgs.builder()        
 *             .saml(RoleMappingSamlArgs.builder()
 *                 .roleMapping(Map.of(&#34;Administrator&#34;, &#34;group1&#34;))
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;roleMapping&#34;, roleMappingRoleMapping);
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aquasec:index/roleMapping:RoleMapping")
public class RoleMapping extends com.pulumi.resources.CustomResource {
    /**
     * Oauth2 Authentication
     * 
     */
    @Export(name="oauth2", type=RoleMappingOauth2.class, parameters={})
    private Output</* @Nullable */ RoleMappingOauth2> oauth2;

    /**
     * @return Oauth2 Authentication
     * 
     */
    public Output<Optional<RoleMappingOauth2>> oauth2() {
        return Codegen.optional(this.oauth2);
    }
    /**
     * OpenId Authentication
     * 
     */
    @Export(name="openid", type=RoleMappingOpenid.class, parameters={})
    private Output</* @Nullable */ RoleMappingOpenid> openid;

    /**
     * @return OpenId Authentication
     * 
     */
    public Output<Optional<RoleMappingOpenid>> openid() {
        return Codegen.optional(this.openid);
    }
    /**
     * SAML Authentication
     * 
     */
    @Export(name="saml", type=RoleMappingSaml.class, parameters={})
    private Output</* @Nullable */ RoleMappingSaml> saml;

    /**
     * @return SAML Authentication
     * 
     */
    public Output<Optional<RoleMappingSaml>> saml() {
        return Codegen.optional(this.saml);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoleMapping(String name) {
        this(name, RoleMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoleMapping(String name, @Nullable RoleMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoleMapping(String name, @Nullable RoleMappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aquasec:index/roleMapping:RoleMapping", name, args == null ? RoleMappingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RoleMapping(String name, Output<String> id, @Nullable RoleMappingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aquasec:index/roleMapping:RoleMapping", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RoleMapping get(String name, Output<String> id, @Nullable RoleMappingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoleMapping(name, id, state, options);
    }
}