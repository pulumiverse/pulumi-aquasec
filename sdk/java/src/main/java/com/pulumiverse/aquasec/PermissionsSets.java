// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.aquasec.PermissionsSetsArgs;
import com.pulumiverse.aquasec.Utilities;
import com.pulumiverse.aquasec.inputs.PermissionsSetsState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The `aquasec.PermissionsSets` resource manages your Permission Set within Aqua.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aquasec.PermissionsSets;
 * import com.pulumi.aquasec.PermissionsSetsArgs;
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
 *         var myTerraformPermSet = new PermissionsSets(&#34;myTerraformPermSet&#34;, PermissionsSetsArgs.builder()        
 *             .actions(            
 *                 &#34;acl_policies.read&#34;,
 *                 &#34;acl_policies.write&#34;,
 *                 &#34;image_profiles.read&#34;,
 *                 &#34;image_profiles.write&#34;,
 *                 &#34;network_policies.read&#34;,
 *                 &#34;network_policies.write&#34;,
 *                 &#34;runtime_policies.read&#34;,
 *                 &#34;runtime_policies.write&#34;,
 *                 &#34;response_policies.read&#34;,
 *                 &#34;response_policies.write&#34;,
 *                 &#34;image_assurance.read&#34;,
 *                 &#34;image_assurance.write&#34;,
 *                 &#34;dashboard.read&#34;,
 *                 &#34;dashboard.write&#34;,
 *                 &#34;risk_explorer.read&#34;,
 *                 &#34;images.read&#34;,
 *                 &#34;images.write&#34;,
 *                 &#34;risks.host_images.read&#34;,
 *                 &#34;risks.host_images.write&#34;,
 *                 &#34;functions.read&#34;,
 *                 &#34;functions.write&#34;,
 *                 &#34;enforcers.read&#34;,
 *                 &#34;enforcers.write&#34;,
 *                 &#34;containers.read&#34;,
 *                 &#34;services.read&#34;,
 *                 &#34;services.write&#34;,
 *                 &#34;infrastructure.read&#34;,
 *                 &#34;infrastructure.write&#34;,
 *                 &#34;risks.vulnerabilities.read&#34;,
 *                 &#34;risks.vulnerabilities.write&#34;,
 *                 &#34;risks.benchmark.read&#34;,
 *                 &#34;risks.benchmark.write&#34;,
 *                 &#34;audits.read&#34;,
 *                 &#34;secrets.read&#34;,
 *                 &#34;secrets.write&#34;,
 *                 &#34;settings.read&#34;,
 *                 &#34;settings.write&#34;,
 *                 &#34;integrations.read&#34;,
 *                 &#34;integrations.write&#34;,
 *                 &#34;registries_integrations.read&#34;,
 *                 &#34;registries_integrations.write&#34;,
 *                 &#34;scan.read&#34;,
 *                 &#34;gateways.read&#34;,
 *                 &#34;gateways.write&#34;,
 *                 &#34;consoles.read&#34;,
 *                 &#34;web_hook.read&#34;,
 *                 &#34;incidents.read&#34;)
 *             .author(&#34;system&#34;)
 *             .description(&#34;Test Permissions Sets created by Terraform&#34;)
 *             .isSuper(false)
 *             .uiAccess(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aquasec:index/permissionsSets:PermissionsSets")
public class PermissionsSets extends com.pulumi.resources.CustomResource {
    /**
     * List of allowed actions for the Permission Set (not relevant if &#39;is_super&#39; is true).
     * 
     */
    @Export(name="actions", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> actions;

    /**
     * @return List of allowed actions for the Permission Set (not relevant if &#39;is_super&#39; is true).
     * 
     */
    public Output<List<String>> actions() {
        return this.actions;
    }
    /**
     * The name of the user who created the Permission Set.
     * 
     */
    @Export(name="author", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> author;

    /**
     * @return The name of the user who created the Permission Set.
     * 
     */
    public Output<Optional<String>> author() {
        return Codegen.optional(this.author);
    }
    /**
     * Free text description for the Permission Set.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Free text description for the Permission Set.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Give the Permission Set full access, meaning all actions are allowed without restriction.
     * 
     */
    @Export(name="isSuper", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isSuper;

    /**
     * @return Give the Permission Set full access, meaning all actions are allowed without restriction.
     * 
     */
    public Output<Optional<Boolean>> isSuper() {
        return Codegen.optional(this.isSuper);
    }
    /**
     * The name of the Permission Set, comprised of alphanumeric characters and &#39;-&#39;, &#39;_&#39;, &#39; &#39;, &#39;:&#39;, &#39;.&#39;, &#39;@&#39;, &#39;!&#39;, &#39;^&#39;.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Permission Set, comprised of alphanumeric characters and &#39;-&#39;, &#39;_&#39;, &#39; &#39;, &#39;:&#39;, &#39;.&#39;, &#39;@&#39;, &#39;!&#39;, &#39;^&#39;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Whether to allow UI access for users with this Permission Set.
     * 
     */
    @Export(name="uiAccess", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> uiAccess;

    /**
     * @return Whether to allow UI access for users with this Permission Set.
     * 
     */
    public Output<Boolean> uiAccess() {
        return this.uiAccess;
    }
    /**
     * The date of the last modification of the Role.
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return The date of the last modification of the Role.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PermissionsSets(String name) {
        this(name, PermissionsSetsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PermissionsSets(String name, PermissionsSetsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PermissionsSets(String name, PermissionsSetsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aquasec:index/permissionsSets:PermissionsSets", name, args == null ? PermissionsSetsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PermissionsSets(String name, Output<String> id, @Nullable PermissionsSetsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aquasec:index/permissionsSets:PermissionsSets", name, state, makeResourceOptions(options, id));
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
    public static PermissionsSets get(String name, Output<String> id, @Nullable PermissionsSetsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PermissionsSets(name, id, state, options);
    }
}
