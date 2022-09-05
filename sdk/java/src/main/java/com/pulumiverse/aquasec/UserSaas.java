// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.aquasec.UserSaasArgs;
import com.pulumiverse.aquasec.Utilities;
import com.pulumiverse.aquasec.inputs.UserSaasState;
import com.pulumiverse.aquasec.outputs.UserSaasGroup;
import com.pulumiverse.aquasec.outputs.UserSaasLogin;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The `aquasec.UserSaas` resource manages your saas users within Aqua.
 * 
 * The users created must have at least one Csp Role that is already present within Aqua.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aquasec.UserSaas;
 * import com.pulumi.aquasec.UserSaasArgs;
 * import com.pulumi.aquasec.inputs.UserSaasGroupArgs;
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
 *         var iaC1 = new UserSaas(&#34;iaC1&#34;, UserSaasArgs.builder()        
 *             .accountAdmin(true)
 *             .cspRoles()
 *             .email(&#34;infrastructure1@example.com&#34;)
 *             .build());
 * 
 *         var iaC2 = new UserSaas(&#34;iaC2&#34;, UserSaasArgs.builder()        
 *             .accountAdmin(false)
 *             .cspRoles(&#34;Default&#34;)
 *             .email(&#34;infrastructure2@example.com&#34;)
 *             .groups(UserSaasGroupArgs.builder()
 *                 .groupAdmin(false)
 *                 .name(&#34;IacGroupName&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aquasec:index/userSaas:UserSaas")
public class UserSaas extends com.pulumi.resources.CustomResource {
    @Export(name="accountAdmin", type=Boolean.class, parameters={})
    private Output<Boolean> accountAdmin;

    public Output<Boolean> accountAdmin() {
        return this.accountAdmin;
    }
    @Export(name="confirmed", type=Boolean.class, parameters={})
    private Output<Boolean> confirmed;

    public Output<Boolean> confirmed() {
        return this.confirmed;
    }
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    public Output<String> created() {
        return this.created;
    }
    @Export(name="cspRoles", type=List.class, parameters={String.class})
    private Output<List<String>> cspRoles;

    public Output<List<String>> cspRoles() {
        return this.cspRoles;
    }
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    public Output<String> email() {
        return this.email;
    }
    @Export(name="groups", type=List.class, parameters={UserSaasGroup.class})
    private Output</* @Nullable */ List<UserSaasGroup>> groups;

    public Output<Optional<List<UserSaasGroup>>> groups() {
        return Codegen.optional(this.groups);
    }
    @Export(name="logins", type=List.class, parameters={UserSaasLogin.class})
    private Output<List<UserSaasLogin>> logins;

    public Output<List<UserSaasLogin>> logins() {
        return this.logins;
    }
    @Export(name="multiaccount", type=Boolean.class, parameters={})
    private Output<Boolean> multiaccount;

    public Output<Boolean> multiaccount() {
        return this.multiaccount;
    }
    @Export(name="passwordReset", type=Boolean.class, parameters={})
    private Output<Boolean> passwordReset;

    public Output<Boolean> passwordReset() {
        return this.passwordReset;
    }
    @Export(name="sendAnnouncements", type=Boolean.class, parameters={})
    private Output<Boolean> sendAnnouncements;

    public Output<Boolean> sendAnnouncements() {
        return this.sendAnnouncements;
    }
    @Export(name="sendNewPlugins", type=Boolean.class, parameters={})
    private Output<Boolean> sendNewPlugins;

    public Output<Boolean> sendNewPlugins() {
        return this.sendNewPlugins;
    }
    @Export(name="sendNewRisks", type=Boolean.class, parameters={})
    private Output<Boolean> sendNewRisks;

    public Output<Boolean> sendNewRisks() {
        return this.sendNewRisks;
    }
    @Export(name="sendScanResults", type=Boolean.class, parameters={})
    private Output<Boolean> sendScanResults;

    public Output<Boolean> sendScanResults() {
        return this.sendScanResults;
    }
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserSaas(String name) {
        this(name, UserSaasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserSaas(String name, UserSaasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserSaas(String name, UserSaasArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aquasec:index/userSaas:UserSaas", name, args == null ? UserSaasArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserSaas(String name, Output<String> id, @Nullable UserSaasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aquasec:index/userSaas:UserSaas", name, state, makeResourceOptions(options, id));
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
    public static UserSaas get(String name, Output<String> id, @Nullable UserSaasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserSaas(name, id, state, options);
    }
}
