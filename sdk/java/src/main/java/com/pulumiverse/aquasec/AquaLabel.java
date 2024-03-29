// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.aquasec.AquaLabelArgs;
import com.pulumiverse.aquasec.Utilities;
import com.pulumiverse.aquasec.inputs.AquaLabelState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="aquasec:index/aquaLabel:AquaLabel")
public class AquaLabel extends com.pulumi.resources.CustomResource {
    /**
     * The name of the user who created the Aqua label.
     * 
     */
    @Export(name="author", refs={String.class}, tree="[0]")
    private Output<String> author;

    /**
     * @return The name of the user who created the Aqua label.
     * 
     */
    public Output<String> author() {
        return this.author;
    }
    /**
     * The creation date of the Aqua label.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return The creation date of the Aqua label.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * Aqua label description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Aqua label description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Aqua label name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Aqua label name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AquaLabel(String name) {
        this(name, AquaLabelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AquaLabel(String name, @Nullable AquaLabelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AquaLabel(String name, @Nullable AquaLabelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aquasec:index/aquaLabel:AquaLabel", name, args == null ? AquaLabelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AquaLabel(String name, Output<String> id, @Nullable AquaLabelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aquasec:index/aquaLabel:AquaLabel", name, state, makeResourceOptions(options, id));
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
    public static AquaLabel get(String name, Output<String> id, @Nullable AquaLabelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AquaLabel(name, id, state, options);
    }
}
